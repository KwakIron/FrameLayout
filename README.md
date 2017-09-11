# FrameLayout
```
public class mView extends View {
    //定义相关变量,依次是妹子显示位置的X,Y坐标
    public float x;
    public float y;
    public mView(Context context) {
        super(context);
        //设置妹子的起始坐标
        x = 0;
        y = 200;
    }

    //重写View类的onDraw()方法
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建,并且实例化Paint的对象
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher_round);
        //绘制萌妹子
        canvas.drawBitmap(bitmap, x, y,paint);
        //判断图片是否回收,木有回收的话强制收回图片
        if(bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }
}
