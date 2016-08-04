package me.lesmtech.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  AlphaPopUpWindow alphaPopUpWindow;

  View anchor;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    alphaPopUpWindow = new AlphaPopUpWindow(this);
    alphaPopUpWindow.updateContentView(getLayout());
    anchor = findViewById(R.id.anchor);
    anchor.setOnClickListener(this);
  }

  private View getLayout() {
    View v = LayoutInflater.from(this)
        .inflate(R.layout.view_filter, alphaPopUpWindow.getParent(), false);
    return v;
  }

  @Override public void onClick(View view) {
    alphaPopUpWindow.showAsDropDown(anchor);
  }
}
