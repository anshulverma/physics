package com.nuaavee.physics.app;

import android.os.Bundle;
import com.google.inject.Inject;
import com.nuaavee.physics.core.InjectorHelper;
import com.nuaavee.physics.core.Shell;
import roboguice.activity.RoboActivity;

/**
 * @author nuaavee
 */
public class MainActivity extends RoboActivity {

  @Inject private Shell shell;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MainView mainView = new MainView(this);
    setContentView(mainView);
    shell = InjectorHelper.getInstance(Shell.class, this);
    shell.activate();
  }

  draw

//  DrawingView dv ;
//  private Paint mPaint;
//
//
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    dv = new DrawingView(this);
//    setContentView(dv);
//    mPaint = new Paint();
//    mPaint.setAntiAlias(true);
//    mPaint.setDither(true);
//    mPaint.setColor(Color.GREEN);
//    mPaint.setStyle(Paint.Style.STROKE);
//    mPaint.setStrokeJoin(Paint.Join.ROUND);
//    mPaint.setStrokeCap(Paint.Cap.ROUND);
//    mPaint.setStrokeWidth(12);
//  }
//
//  public class DrawingView extends View {
//
//    public int width;
//    public  int height;
//    private Bitmap mBitmap;
//    private Canvas mCanvas;
//    private Path    mPath;
//    private Paint   mBitmapPaint;
//    Context context;
//    private Paint circlePaint;
//    private Path circlePath;
//
//    public DrawingView(Context c) {
//      super(c);
//      context=c;
//      mPath = new Path();
//      mBitmapPaint = new Paint(Paint.DITHER_FLAG);
//      circlePaint = new Paint();
//      circlePath = new Path();
//      circlePaint.setAntiAlias(true);
//      circlePaint.setColor(Color.BLUE);
//      circlePaint.setStyle(Paint.Style.STROKE);
//      circlePaint.setStrokeJoin(Paint.Join.MITER);
//      circlePaint.setStrokeWidth(4f);
//
//
//    }
//
//    @Override
//    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//      super.onSizeChanged(w, h, oldw, oldh);
//
//      mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
//      mCanvas = new Canvas(mBitmap);
//
//    }
//    @Override
//    protected void onDraw(Canvas canvas) {
//      super.onDraw(canvas);
//
//      canvas.drawBitmap( mBitmap, 0, 0, mBitmapPaint);
//
//      canvas.drawPath( mPath,  mPaint);
//
//      canvas.drawPath( circlePath,  circlePaint);
//    }
//
//    private float mX, mY;
//    private static final float TOUCH_TOLERANCE = 4;
//
//    private void touch_start(float x, float y) {
//      mPath.reset();
//      mPath.moveTo(x, y);
//      mX = x;
//      mY = y;
//    }
//    private void touch_move(float x, float y) {
//      float dx = Math.abs(x - mX);
//      float dy = Math.abs(y - mY);
//      if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
//        mPath.quadTo(mX, mY, (x + mX)/2, (y + mY)/2);
//        mX = x;
//        mY = y;
//
//        circlePath.reset();
//        circlePath.addCircle(mX, mY, 30, Path.Direction.CW);
//      }
//    }
//    private void touch_up() {
//      mPath.lineTo(mX, mY);
//      circlePath.reset();
//      // commit the path to our offscreen
//      mCanvas.drawPath(mPath,  mPaint);
//      // kill this so we don't double draw
//      mPath.reset();
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//      float x = event.getX();
//      float y = event.getY();
//
//      switch (event.getAction()) {
//        case MotionEvent.ACTION_DOWN:
//          touch_start(x, y);
//          invalidate();
//          break;
//        case MotionEvent.ACTION_MOVE:
//          touch_move(x, y);
//          invalidate();
//          break;
//        case MotionEvent.ACTION_UP:
//          touch_up();
//          invalidate();
//          break;
//      }
//      return true;
//    }
//  }
}
