package com.example.admin.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFramentActivity {
    @Override
    protected Fragment createFrament() {
        return new CrimeListFragment();
    }
}
