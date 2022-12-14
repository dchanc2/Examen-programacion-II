// Generated by view binder compiler. Do not edit!
package com.example.blocdenotasPrueba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.blocdenotasPrueba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNuevaNotaDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextContenido;

  @NonNull
  public final EditText editTextTitulo;

  @NonNull
  public final RadioButton radioButtonColorAzul;

  @NonNull
  public final RadioButton radioButtonColorRojo;

  @NonNull
  public final RadioButton radioButtonColorVerde;

  @NonNull
  public final RadioGroup radioGrupColor;

  @NonNull
  public final Switch switch1;

  @NonNull
  public final TextView textView3;

  private FragmentNuevaNotaDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editTextContenido, @NonNull EditText editTextTitulo,
      @NonNull RadioButton radioButtonColorAzul, @NonNull RadioButton radioButtonColorRojo,
      @NonNull RadioButton radioButtonColorVerde, @NonNull RadioGroup radioGrupColor,
      @NonNull Switch switch1, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.editTextContenido = editTextContenido;
    this.editTextTitulo = editTextTitulo;
    this.radioButtonColorAzul = radioButtonColorAzul;
    this.radioButtonColorRojo = radioButtonColorRojo;
    this.radioButtonColorVerde = radioButtonColorVerde;
    this.radioGrupColor = radioGrupColor;
    this.switch1 = switch1;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNuevaNotaDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNuevaNotaDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_nueva_nota_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNuevaNotaDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextContenido;
      EditText editTextContenido = ViewBindings.findChildViewById(rootView, id);
      if (editTextContenido == null) {
        break missingId;
      }

      id = R.id.editTextTitulo;
      EditText editTextTitulo = ViewBindings.findChildViewById(rootView, id);
      if (editTextTitulo == null) {
        break missingId;
      }

      id = R.id.radioButtonColorAzul;
      RadioButton radioButtonColorAzul = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonColorAzul == null) {
        break missingId;
      }

      id = R.id.radioButtonColorRojo;
      RadioButton radioButtonColorRojo = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonColorRojo == null) {
        break missingId;
      }

      id = R.id.radioButtonColorVerde;
      RadioButton radioButtonColorVerde = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonColorVerde == null) {
        break missingId;
      }

      id = R.id.radioGrupColor;
      RadioGroup radioGrupColor = ViewBindings.findChildViewById(rootView, id);
      if (radioGrupColor == null) {
        break missingId;
      }

      id = R.id.switch1;
      Switch switch1 = ViewBindings.findChildViewById(rootView, id);
      if (switch1 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentNuevaNotaDialogBinding((ConstraintLayout) rootView, editTextContenido,
          editTextTitulo, radioButtonColorAzul, radioButtonColorRojo, radioButtonColorVerde,
          radioGrupColor, switch1, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
