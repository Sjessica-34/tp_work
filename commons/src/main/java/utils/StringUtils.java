package utils;

public class StringUtils {

	public static boolean isNullOrEmpty(String str) {
		Boolean bool;
		if (str != null && !str.trim().isEmpty()) {
			bool = false;
		} else {
			bool = true;
		}
		return bool;
	}
}
