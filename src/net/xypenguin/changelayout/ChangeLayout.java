package net.xypenguin.changelayout;

import net.xypenguin.changelayout.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChangeLayout extends Activity implements OnClickListener {
	// ���C����ʂ̃t�B�[���h
	private LinearLayout mainLayout;
	private Button gotoItem;
	private TextView textView;

	// �A�C�e����ʂ̃t�B�[���h
	private LinearLayout subLayout;
	private Button item1;
	private Button item2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_layout);
		setTitle("���C�����");

		// �R���|�[�l���g�̊֘A�t��
		mainLayout = (LinearLayout) this.findViewById(R.id.mainLayout);
		subLayout = (LinearLayout) this.findViewById(R.id.subLayout);
		gotoItem = (Button) this.findViewById(R.id.button1);
		item1 = (Button) this.findViewById(R.id.button2);
		item2 = (Button) this.findViewById(R.id.button3);
		textView = (TextView) this.findViewById(R.id.textView1);
		
		// ���X�i�[���Z�b�g
		gotoItem.setOnClickListener(this);
		item1.setOnClickListener(this);
		item2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		switch (v.getId()) {
		case R.id.button1:
			mainLayout.setVisibility(View.INVISIBLE);
			setTitle("�A�C�e�����");
			subLayout.setVisibility(View.VISIBLE);
			break;
		case R.id.button2:
			mainLayout.setVisibility(View.VISIBLE);
			setTitle("���C�����");
			subLayout.setVisibility(View.INVISIBLE);
			textView.setText("�򑐂��g�����I");
			break;
		case R.id.button3:
			mainLayout.setVisibility(View.VISIBLE);
			setTitle("���C�����");
			subLayout.setVisibility(View.INVISIBLE);
			textView.setText("�ŏ��������g�����I");
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_change_layout, menu);
		return true;
	}
}
