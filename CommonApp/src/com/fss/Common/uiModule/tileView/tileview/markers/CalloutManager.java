package com.fss.Common.uiModule.tileView.tileview.markers;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

import com.fss.Common.uiModule.tileView.tileview.detail.DetailManager;

public class CalloutManager extends MarkerManager {

	public CalloutManager( Context context, DetailManager detailManager ) {
		super( context, detailManager );
	}
	
	private void clear(){
		while( getChildCount() > 0 ) {
			View child = getChildAt( 0 );
			removeView( child );
		}
	}
	
	@Override
	public boolean onTouchEvent( MotionEvent event ) {
		clear();
		return false;
	}

}
