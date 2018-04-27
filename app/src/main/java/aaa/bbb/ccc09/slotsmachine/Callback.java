package aaa.bbb.ccc09.slotsmachine;

import android.support.v7.widget.LinearLayoutManager;

import java.util.List;

public abstract class Callback {
    public abstract void OnFinishListener();

    private List<LinearLayoutManager> layoutManagers;

    public void setLayoutManagers(List<LinearLayoutManager> layoutManagers) {
        this.layoutManagers = layoutManagers;
    }

    public List<LinearLayoutManager> getLayoutManagers() {
        return layoutManagers;
    }
}
