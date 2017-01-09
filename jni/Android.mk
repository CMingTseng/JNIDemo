# LOCAL_PATH := $(call my-dir)
# include $(CLEAR_VARS)

# LOCAL_MODULE := libJNIDemoJni
# LOCAL_LDFLAGS := -Wl,--build-id
# LOCAL_SRC_FILES := \
#	/Users/wang/WorkPlace/MyWork/JNIDemo/app/src/main/jni/Android.mk \
#	/Users/wang/WorkPlace/MyWork/JNIDemo/app/src/main/jni/com_kyo_jnidemo_jni_JNIDemoUtil.c \

# LOCAL_C_INCLUDES += /Users/wang/WorkPlace/MyWork/JNIDemo/app/src/main/jni
# LOCAL_C_INCLUDES += /Users/wang/WorkPlace/MyWork/JNIDemo/app/src/debug/jni

# include $(BUILD_SHARED_LIBRARY)


LOCAL_MODULE := ${call my-dir}/
include ${CLEAR_VARS}
LOCAL_SRC_FILES := /Users/wang/WorkPlace/MyWork/JNIDemo/jni/JNIDemoUtil.c
LOCAL_MODULE = libJNIDemo

include ${BUILD_SHARED_LIBRARY}



