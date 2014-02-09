package com.lambazon.factory;

import java.util.HashMap;
import java.util.Map;

import com.lambazon.domain.Machine;
import com.lambazon.domain.OrderHistory;
import com.lambazon.domain.OrderHistoryImpl;

public class LambazonObjectFactory {
	
	private String version;
	private Map<String, Object> cache = new HashMap<String, Object>();

	public <T> T get(Class<T> t) {
		// return best implementation here and cache if appropriate
		if (t == Machine.class) {
			return getBestMachine();
		} else {
			return get(t);
		}
	}

	@SuppressWarnings("unchecked")
	private <T> T getBestMachine() {
		if (Math.random() <.5) {
			return (T) new Machine("127.0.0.1");	
		} else {
			return (T) new Machine("192.168.1.105:57974");
		}
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private <T> T getIt(Class<T> t) {
		if (t == OrderHistory.class) 
		return (T) new OrderHistoryImpl();
		return null;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "LambazonObjectFactory [version=" + version + "]";
	}
	
	
}
