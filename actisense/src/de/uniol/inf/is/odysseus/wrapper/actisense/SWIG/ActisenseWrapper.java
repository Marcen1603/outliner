/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.uniol.inf.is.odysseus.wrapper.actisense.SWIG;

public class ActisenseWrapper {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ActisenseWrapper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ActisenseWrapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @Override
protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ActisenseJavaJNI.delete_ActisenseWrapper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    ActisenseJavaJNI.ActisenseWrapper_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    ActisenseJavaJNI.ActisenseWrapper_change_ownership(this, swigCPtr, true);
  }

  public ActisenseWrapper(String comPort, int baudRate) throws java.lang.RuntimeException {
    this(ActisenseJavaJNI.new_ActisenseWrapper(comPort, baudRate), true);
    ActisenseJavaJNI.ActisenseWrapper_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void start() {
    ActisenseJavaJNI.ActisenseWrapper_start(swigCPtr, this);
  }

  public void stop() {
    ActisenseJavaJNI.ActisenseWrapper_stop(swigCPtr, this);
  }

  public void onMessage(java.nio.ByteBuffer buffer) {
    if (getClass() == ActisenseWrapper.class) ActisenseJavaJNI.ActisenseWrapper_onMessage(swigCPtr, this, buffer); else ActisenseJavaJNI.ActisenseWrapper_onMessageSwigExplicitActisenseWrapper(swigCPtr, this, buffer);
  }

}
