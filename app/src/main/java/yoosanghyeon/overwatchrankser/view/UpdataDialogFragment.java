package yoosanghyeon.overwatchrankser.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import yoosanghyeon.overwatchrankser.common.PropertyManager;

/**
 * Created by Arous on 2017-02-10.
 */

public class UpdataDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    public static UpdataDialogFragment newInstance() {
        Bundle args = new Bundle();
        UpdataDialogFragment fragment = new UpdataDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return createdDialog();
    }

    // Dialog  생성
    private Dialog createdDialog(){

        PropertyManager.getInstance().setCheckVersionOnce("checkOnce");

        return new AlertDialog.Builder(getActivity()).setTitle("업데이트 안내").
                setPositiveButton("취소",this)
                .setNegativeButton("확인", this)
                .setMessage(getUpdateMessage())
                .create();

    }

    public String getUpdateMessage(){
        StringBuilder builder = new StringBuilder();
        builder.append("기존 버전에 에러를 조치 하였습니다");
        builder.append("\n");
        builder.append("( 전적 조회에 대한 에러로 업데이트를");
        builder.append(" 꼭 부탁드립니다.)");
        return builder.toString();
    }

    // Button Event 발생 처리
    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case DialogInterface.BUTTON_POSITIVE:
                dismiss();
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + getActivity().getPackageName())));
                dismiss();
                break;
        }

    }

}
