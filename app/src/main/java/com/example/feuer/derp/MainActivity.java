package com.example.feuer.derp;

import android.os.Bundle;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.opengl.GLSurfaceView;

public class MainActivity extends Activity {

    GLSurfaceView v = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

	v = new GLSurfaceView(this);
	v.setRenderer(new MyGLRenderer());
	
	setContentView(v);
    }

    @Override
    protected void onPause() {
	super.onPause();
 
	if (v != null) {
	    v.onPause();
	}
    }
 
    @Override
    protected void onResume() {
	super.onResume();
 
	if (v != null) {
	    v.onResume();
	}
    }

}
