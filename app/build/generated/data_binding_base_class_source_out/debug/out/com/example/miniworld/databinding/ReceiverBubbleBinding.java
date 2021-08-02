// Generated by view binder compiler. Do not edit!
package com.example.miniworld.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.miniworld.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReceiverBubbleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView receivertext;

  private ReceiverBubbleBinding(@NonNull LinearLayout rootView, @NonNull TextView receivertext) {
    this.rootView = rootView;
    this.receivertext = receivertext;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReceiverBubbleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReceiverBubbleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.receiver_bubble, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReceiverBubbleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.receivertext;
      TextView receivertext = rootView.findViewById(id);
      if (receivertext == null) {
        break missingId;
      }

      return new ReceiverBubbleBinding((LinearLayout) rootView, receivertext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
