package com.joseph.fragmentcrushcourse.ui.bottom_navigation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import timber.log.Timber

private const val TAG = "[FragmentB]"

class FragmentB : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.tag(TAG).d("- onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.tag(TAG).d("- onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.tag(TAG).d("- onCreateView()")
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.tag(TAG).d("- onViewCreated()")
    }

    override fun onResume() {
        super.onResume()
        Timber.tag(TAG).d("- onResume()")
    }

    override fun onPause() {
        super.onPause()
        Timber.tag(TAG).d("- onPause()")
    }

    override fun onStop() {
        super.onStop()
        Timber.tag(TAG).d("- onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.tag(TAG).d("- onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.tag(TAG).d("- onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.tag(TAG).d("- onDetach")
    }
}