package aaa.bbb.ccc09;

import android.support.v7.widget.RecyclerView;

public class ScrollListener extends RecyclerView.OnScrollListener {
    private Callback callback;

    public ScrollListener(Callback callback) {
        this.callback = callback;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        switch (newState) {
            case RecyclerView.SCROLL_STATE_IDLE:
                callback.OnFinishListener();
        }

    }

    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

    }
}