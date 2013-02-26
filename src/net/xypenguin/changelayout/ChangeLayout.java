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
	// メイン画面のフィールド
	private LinearLayout mainLayout;
	private Button gotoItem;
	private TextView textView;

	// アイテム画面のフィールド
	private LinearLayout subLayout;
	private Button item1;
	private Button item2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_layout);
		setTitle("メイン画面");

		// コンポーネントの関連付け
		mainLayout = (LinearLayout) this.findViewById(R.id.mainLayout);
		subLayout = (LinearLayout) this.findViewById(R.id.subLayout);
		gotoItem = (Button) this.findViewById(R.id.button1);
		item1 = (Button) this.findViewById(R.id.button2);
		item2 = (Button) this.findViewById(R.id.button3);
		textView = (TextView) this.findViewById(R.id.textView1);
		
		// リスナーをセット
		gotoItem.setOnClickListener(this);
		item1.setOnClickListener(this);
		item2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch (v.getId()) {
		case R.id.button1:
			mainLayout.setVisibility(View.INVISIBLE);
			setTitle("アイテム画面");
			subLayout.setVisibility(View.VISIBLE);
			break;
		case R.id.button2:
			mainLayout.setVisibility(View.VISIBLE);
			setTitle("メイン画面");
			subLayout.setVisibility(View.INVISIBLE);
			textView.setText("薬草を使った！");
			break;
		case R.id.button3:
			mainLayout.setVisibility(View.VISIBLE);
			setTitle("メイン画面");
			subLayout.setVisibility(View.INVISIBLE);
			textView.setText("毒消し草を使った！");
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
