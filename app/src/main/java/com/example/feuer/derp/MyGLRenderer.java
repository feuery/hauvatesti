package com.example.feuer.derp;

import android.opengl.GLSurfaceView;
import android.opengl.GLES20;

import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLConfig;

public class MyGLRenderer implements GLSurfaceView.Renderer {

    static {
        System.loadLibrary("native-lib");
    }
 
    public static native void on_surface_created();
 
    public static native void on_surface_changed(int width, int height);
 
    public static native void on_draw_frame();
    
    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        // Set the background frame color
	on_surface_created();
    }

    public void onDrawFrame(GL10 unused) {
        // Redraw background color
	on_draw_frame();
    }

    public void onSurfaceChanged(GL10 unused, int width, int height) {
	on_surface_changed(width, height);
    }
}
