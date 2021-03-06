package kobe.uka.checklistmemo.view;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kobe.uka.checklistmemo.R;

public class MemoListActivity extends MainActivity {

    /**
     * クリエイト時
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memo_list);
    }

    /**
     * リスト表示
     * controller xmlから値取得（）
     * controller DBから値取得（）
     *
     */

    /**
     * レジューム時
     * controller値保存（）
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * ポーズ時
     * controller値保存（）
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * ストップ時
     * controller値保存（）
     */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     *新規ボタンタップ時
     * controller新規画面遷移処理()
     */

    /**
     * リストシングルタップ時
     * controller編集画面遷移処理()
     */

    /**
     * リストロングタップ時
     * controllerダイアログ表示処理()
     */


}
