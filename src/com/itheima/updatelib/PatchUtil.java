package com.itheima.updatelib;

public class PatchUtil {
	
	/**
	 * 合并成新版本
	 * 
	 * @param oldPath 旧版本apk
	 * @param newPath 新版本apk
	 * @param patchPath 更新包拦截
	 * 
	 * @return 0:合并成功
	 */
	public static native int patch(String oldPath, String newPath, String patchPath);

}
