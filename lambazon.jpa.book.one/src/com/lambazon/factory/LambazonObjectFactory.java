package com.lambazon.factory;

import java.util.HashMap;
import java.util.Map;

import com.lambazon.domain.Machine;
import com.lambazon.domain.OrderHistory;
import com.lambazon.domain.OrderHistoryImpl;

public class LambazonObjectFactory {
	
	private Map<String, Object> cache = new HashMap<String, Object>();

	@SuppressWarnings("unchecked")
	public static <T> T get(Class<T> t) {
		// return best implementation here and cache if appropriate

		if (t == Machine.class) {
			return getBestMachine(t);
		} else if (t == OrderHistory.class) {
			return (T) new OrderHistoryImpl();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private static <T> T getBestMachine(Class<T> t) {
		return (T) new Machine("127.0.0.1");
	}

}
