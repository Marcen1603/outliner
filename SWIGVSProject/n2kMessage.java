/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.uniol.inf.is.odysseus.wrapper.actisense.SWIG;

public class n2kMessage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected n2kMessage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(n2kMessage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ActisenseJavaJNI.delete_n2kMessage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public n2kMessage(SWIGTYPE_p_signed_char msg, int length) {
    this(ActisenseJavaJNI.new_n2kMessage(SWIGTYPE_p_signed_char.getCPtr(msg), length), true);
  }

  public int getLength() {
    return ActisenseJavaJNI.n2kMessage_getLength(swigCPtr, this);
  }

  public byte getData(int index) {
    return ActisenseJavaJNI.n2kMessage_getData(swigCPtr, this, index);
  }

}
