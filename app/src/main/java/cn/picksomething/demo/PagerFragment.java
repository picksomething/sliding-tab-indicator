package cn.picksomething.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PagerFragment extends Fragment {

    private int mCurrentPager;

    //newInstance constructor for creating fragment with arguments
    public static PagerFragment newInstance(int page) {
        PagerFragment pagerFragment = new PagerFragment();
        Bundle args = new Bundle();
        args.putInt("args_page", page);
        pagerFragment.setArguments(args);
        return pagerFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCurrentPager = getArguments().getInt("args_page", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pager_fragment_layout, container, false);
        TextView textView = (TextView) view.findViewById(R.id.pager_content_text);
        textView.setText(getString(R.string.pager_content_str, mCurrentPager));
        return view;
    }
}
