package com.atw.signweb.util;

import java.util.Collection;
import java.util.Map;

/**
 * @author Karl
 * @Description
 * @date 2019/1/15 22:43
 */
public class CheckUtil {

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static boolean isNotEmpty(String s) {
		return !isEmpty(s);
	}

	public static <T> boolean isNull(Collection<T> collection) {
		return collection == null || collection.size() == 0;
	}

	public static <T> boolean isNotNull(Collection<T> collection) {
		return !isNull(collection);
	}

	public static <K,V> boolean isNull(Map<K,V> map) {
		return map == null || map.size() == 0;
	}

	public static <K,V> boolean isNotNull(Map<K,V> map) {
		return !isNull(map);
	}

}
