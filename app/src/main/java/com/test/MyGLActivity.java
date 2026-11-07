package com.test;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
/**
 * Our OpenGL program's main activity
 */
public class MyGLActivity extends Activity {

    private GLSurfaceView glView;  // Use subclass of GLSurfaceView (NEW)

    // Call back when the activity is started, to initialize the view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glView = new MyGLSurfaceView(this);
        setContentView(glView);  // Set View (NEW)
    }

    // Call back when the activity is going into the background
    @Override
    protected void onPause() {
        super.onPause();
        glView.onPause();
    }

    // Call back after onPause()
    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();
    }
}