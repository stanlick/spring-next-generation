package com.lambazon.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LoggerAspect {
	
	private Logger logger = Logger.getLogger("com.lambazon.aspects.LoggerAspect");

	public Object logCall(ProceedingJoinPoint target) throws Throwable {
		// Before it actually happens
		logger.debug(buildString(Timing.AfterMethodCall, target,null));
		Object returnValue = target.proceed();

		// After it has happened
		

		return returnValue;
	}

	private String buildString(Timing beforeAfter,
			ProceedingJoinPoint joinPoint, Object returnValue) {

		StringBuilder builder = new StringBuilder(512);
		String arguments = argsToString(joinPoint.getArgs());
		Signature signature = joinPoint.getSignature();
		Object target = joinPoint.getTarget();

		builder.append("Caller:" + findCaller())
				.append(" Called:").append(signature.toShortString() + " On " + target.getClass().getSimpleName())
				.append(" Arguments Passed:" + arguments)
				.append(" Return Value:" + returnValue);

		return builder.toString();
	}

	private String findCaller() {

		// the caller immediately proceeds the stack entry ===> com.sun.proxy in my testing
		// this is clearly due to JdkDynamicAopProxy positioning
		// TODO Research further 

		StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
		boolean found = false;
		for (StackTraceElement stackTraceElement : callStack) {
			if (found) {
				return getSimpleName(stackTraceElement) + "."
						+ stackTraceElement.getMethodName() + " at line number " +  stackTraceElement.getLineNumber();
			}

			if (stackTraceElement.getClassName().startsWith("com.sun.proxy")) {
				found = true;
			}
		}
		return "unknown";
	}

	private String getSimpleName(StackTraceElement stackTraceElement) {
		// com.lambazon.controller.CustomerController ---> CustomerController
		int lastDot = stackTraceElement.getClassName().lastIndexOf(".");
		
		return stackTraceElement.getClassName().substring(lastDot);
	}

	private String argsToString(Object[] args) {
		StringBuilder argz = new StringBuilder(512);
		for (Object object : args) {
			argz.append(object).append(",");
		}
		if (argz.length() == 0) {
			return "";
		}

		return argz.toString().substring(0, argz.length() - 1);
	}

	enum Timing {
		BeforeMethodCall, AfterMethodCall
	}

}