#include <com_cotrust_myapplication_MainActivity.h>
#include "jni.h"
JNIEXPORT jint JNICALL Java_com_cotrust_myapplication_MainActivity_getAdd(JNIEnv *env, jobject obj, jint a, jint b)
{
    return a+b;
}