// Generated by view binder compiler. Do not edit!
package com.example.miniworld.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.miniworld.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView addAPost;

  @NonNull
  public final ImageView addAStory;

  @NonNull
  public final TextView addast;

  @NonNull
  public final TextView addastorytext;

  @NonNull
  public final ImageView addstoryimage;

  @NonNull
  public final ImageView logoMainPage;

  @NonNull
  public final ImageView menuBar;

  @NonNull
  public final ImageView posttext;

  private FragmentAddBinding(@NonNull LinearLayout rootView, @NonNull ImageView addAPost,
      @NonNull ImageView addAStory, @NonNull TextView addast, @NonNull TextView addastorytext,
      @NonNull ImageView addstoryimage, @NonNull ImageView logoMainPage, @NonNull ImageView menuBar,
      @NonNull ImageView posttext) {
    this.rootView = rootView;
    this.addAPost = addAPost;
    this.addAStory = addAStory;
    this.addast = addast;
    this.addastorytext = addastorytext;
    this.addstoryimage = addstoryimage;
    this.logoMainPage = logoMainPage;
    this.menuBar = menuBar;
    this.posttext = posttext;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addAPost;
      ImageView addAPost = rootView.findViewById(id);
      if (addAPost == null) {
        break missingId;
      }

      id = R.id.addAStory;
      ImageView addAStory = rootView.findViewById(id);
      if (addAStory == null) {
        break missingId;
      }

      id = R.id.addast;
      TextView addast = rootView.findViewById(id);
      if (addast == null) {
        break missingId;
      }

      id = R.id.addastorytext;
      TextView addastorytext = rootView.findViewById(id);
      if (addastorytext == null) {
        break missingId;
      }

      id = R.id.addstoryimage;
      ImageView addstoryimage = rootView.findViewById(id);
      if (addstoryimage == null) {
        break missingId;
      }

      id = R.id.logoMainPage;
      ImageView logoMainPage = rootView.findViewById(id);
      if (logoMainPage == null) {
        break missingId;
      }

      id = R.id.menuBar;
      ImageView menuBar = rootView.findViewById(id);
      if (menuBar == null) {
        break missingId;
      }

      id = R.id.posttext;
      ImageView posttext = rootView.findViewById(id);
      if (posttext == null) {
        break missingId;
      }

      return new FragmentAddBinding((LinearLayout) rootView, addAPost, addAStory, addast,
          addastorytext, addstoryimage, logoMainPage, menuBar, posttext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
