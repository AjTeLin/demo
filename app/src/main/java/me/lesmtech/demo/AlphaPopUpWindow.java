package me.lesmtech.demo;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/**
 * @Author te.lin
 * @Since 8/4/16
 */
public class AlphaPopUpWindow extends PopupWindow {

  private FrameLayout container;

  public AlphaPopUpWindow(Context context) {
    super(context);
    container = new FrameLayout(context);
    setContentView(container);
    setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
    setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
    setOutsideTouchable(false);
    setBackgroundDrawable(
        new ColorDrawable(context.getResources().getColor(android.R.color.transparent)));
    container.setPadding(0, 0, 0, 300);
    container.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        dismiss();
      }
    });
  }

  public FrameLayout getParent() {
    return container;
  }

  public void updateContentView(final View newContentView) {
    if (container.getChildCount() > 0) {
      container.removeAllViews();
    }
    container.addView(newContentView);
  }

  @Override public void dismiss() {
    try {
      super.dismiss();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
    try {
      super.showAsDropDown(anchor, xoff, yoff, gravity);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

