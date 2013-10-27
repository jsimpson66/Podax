package com.axelby.podax;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.util.EmptyStackException;

@ReportsCrashes(formKey = "",
				formUri = "http://podax.axelby.com/error",
				mode = ReportingInteractionMode.TOAST,
				resToastText = R.string.crash_toast_text)
public class PodaxApplication extends Application {

	@Override
	public void onCreate() {
		ACRA.init(this);
		super.onCreate();

		PodaxLog.ensureRemoved(this);
	}

}
