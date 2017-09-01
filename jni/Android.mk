LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE     := patch
LOCAL_SRC_FILES  := com_itheima_updatelib_PatchUtil.c


include $(BUILD_SHARED_LIBRARY)