package com.gclue.MessageSample001;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MessageSample001Activity extends Activity {
	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_message_sample001 );

		// LogCat�ŕ\������
		String message_log = "TEST LOG";
		Log.i( "TEST", message_log );
		// Toast�ŕ\������
		String message_toast = "TEST TOAST";
		Toast.makeText(this, message_toast, Toast.LENGTH_LONG).show();
		// Dialog�ŕ\������
		String message_dialog = "TEST DIALOG";
		showDialog( message_dialog );
	}

	/**
	 * �_�C�A���O�ŕ������\������B
	 * @param message �\��������������
	 */
	private void showDialog( String message ) {
		new AlertDialog.Builder( this )
			.setMessage( message )
			.setNeutralButton( "YES", new DialogInterface.OnClickListener() {
				// ���̒���"YES"���̏����������
				public void onClick( DialogInterface dialog, int whichButton ) {
				}
			} ).show();
	}
}