package yoosanghyeon.overwatchrankser.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import yoosanghyeon.overwatchrankser.R;
import yoosanghyeon.overwatchrankser.detailpage.DetailActivity;
import yoosanghyeon.overwatchrankser.util.ExpressionUtil;

/**
 * fragment ButterKnife 라이브러리 사용
 */

public class UserSearchFragment extends Fragment implements View.OnClickListener {


    @BindView(R.id.battletag_input)
    EditText battletagInput;

    @BindView(R.id.find_id)
    Button findIdBtn;

    public UserSearchFragment() {
    }


    public static UserSearchFragment newInstance() {
        UserSearchFragment fragment = new UserSearchFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentVIew = inflater.inflate(R.layout.fragment_user_search, container, false);
        ButterKnife.bind(this, fragmentVIew);
        findIdBtn.setOnClickListener(this);

        return fragmentVIew;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    @Override
    public void onDetach() {
        super.onDetach();
    }


    @Override
    public void onClick(View v) {
        // EditText  null check
        if (battletagInput.equals(null) || battletagInput.equals("")) {
            Toast.makeText(getContext(), "태그가 공백 입니다. 텍스트 입력하세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        // BattleTag null check
        String battleTag = battletagInput.getText().toString();
        if (ExpressionUtil.getInstance().isBattleTagCheck(battleTag)){
            startDetatilActivity(ExpressionUtil.getInstance().patternTextChance(battleTag));
        }else {
            Toast.makeText(getContext(),"태그를 정확히 입력해주세요.", Toast.LENGTH_SHORT).show();
            return;
        }

    }


    // onClick Logic
    public void startDetatilActivity(String inputTag) {

        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra("tag", inputTag);
        startActivity(intent);

    }
}
