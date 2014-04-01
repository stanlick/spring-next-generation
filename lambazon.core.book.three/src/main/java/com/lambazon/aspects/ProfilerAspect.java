
package com.lambazon.aspects;

import java.text.NumberFormat;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilerAspect {

	public Object profile(ProceedingJoinPoint joinPoint) throws Throwable {

		double start = System.nanoTime();
		Object returnValue = joinPoint.proceed();
		double elapsed = (System.nanoTime() - start) / secondAsNanos;
		logger.debug(joinPoint.getStaticPart()+ ": elapsed time in " + fmt.format(elapsed) + " seconds");

		return returnValue;
	}

	private Logger logger = Logger.getLogger("com.lambazon.aspects.ProfilerAspect");

	final static long secondAsNanos = 1000000000;
	final static NumberFormat fmt = NumberFormat.getNumberInstance();
	static {
		fmt.setMinimumFractionDigits(10);
	}
}