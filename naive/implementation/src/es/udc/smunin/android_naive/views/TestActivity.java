package es.udc.smunin.android_naive.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import es.udc.smunin.android_naive.R;
import es.udc.smunin.androidnaive.views.asyncworkers.AsyncGooglePageFetcher;

/**
 * This activity provides a button which will perform a HTTP request.
 * 
 * 
 */
public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_layout);

		((Button) findViewById(R.id.button1))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						new AsyncGooglePageFetcher(getApplicationContext())
								.execute();
					}
				});
	}
}
