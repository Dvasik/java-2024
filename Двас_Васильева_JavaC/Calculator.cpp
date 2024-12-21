#include "Calculator.h"
#include <iostream>

JNIEXPORT void JNICALL Java_Calculator_Calculate(JNIEnv *env, jobject thisObject, jint a, jint b)
{
  std::cout << a + b;
}
