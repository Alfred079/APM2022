// Generated by view binder compiler. Do not edit!
package com.example.mamae.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.mamae.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCadastroBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCriarconta;

  @NonNull
  public final TextView dataNascTv;

  @NonNull
  public final TextView emailTv3;

  @NonNull
  public final EditText idDATA;

  @NonNull
  public final EditText idNomeTxt;

  @NonNull
  public final EditText idemail;

  @NonNull
  public final TextView loginTv;

  @NonNull
  public final TextView nomeTv;

  @NonNull
  public final TextView passwordTv;

  @NonNull
  public final TextView tvLogin;

  @NonNull
  public final ImageView txtExpressao;

  @NonNull
  public final EditText txtPassword;

  private ActivityCadastroBinding(@NonNull LinearLayout rootView, @NonNull Button btnCriarconta,
      @NonNull TextView dataNascTv, @NonNull TextView emailTv3, @NonNull EditText idDATA,
      @NonNull EditText idNomeTxt, @NonNull EditText idemail, @NonNull TextView loginTv,
      @NonNull TextView nomeTv, @NonNull TextView passwordTv, @NonNull TextView tvLogin,
      @NonNull ImageView txtExpressao, @NonNull EditText txtPassword) {
    this.rootView = rootView;
    this.btnCriarconta = btnCriarconta;
    this.dataNascTv = dataNascTv;
    this.emailTv3 = emailTv3;
    this.idDATA = idDATA;
    this.idNomeTxt = idNomeTxt;
    this.idemail = idemail;
    this.loginTv = loginTv;
    this.nomeTv = nomeTv;
    this.passwordTv = passwordTv;
    this.tvLogin = tvLogin;
    this.txtExpressao = txtExpressao;
    this.txtPassword = txtPassword;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCadastroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCadastroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cadastro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCadastroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_criarconta;
      Button btnCriarconta = rootView.findViewById(id);
      if (btnCriarconta == null) {
        break missingId;
      }

      id = R.id.data_nasc_tv;
      TextView dataNascTv = rootView.findViewById(id);
      if (dataNascTv == null) {
        break missingId;
      }

      id = R.id.email_tv3;
      TextView emailTv3 = rootView.findViewById(id);
      if (emailTv3 == null) {
        break missingId;
      }

      id = R.id.idDATA;
      EditText idDATA = rootView.findViewById(id);
      if (idDATA == null) {
        break missingId;
      }

      id = R.id.idNomeTxt;
      EditText idNomeTxt = rootView.findViewById(id);
      if (idNomeTxt == null) {
        break missingId;
      }

      id = R.id.idemail;
      EditText idemail = rootView.findViewById(id);
      if (idemail == null) {
        break missingId;
      }

      id = R.id.login_tv;
      TextView loginTv = rootView.findViewById(id);
      if (loginTv == null) {
        break missingId;
      }

      id = R.id.nome_tv;
      TextView nomeTv = rootView.findViewById(id);
      if (nomeTv == null) {
        break missingId;
      }

      id = R.id.password_tv;
      TextView passwordTv = rootView.findViewById(id);
      if (passwordTv == null) {
        break missingId;
      }

      id = R.id.tv_login;
      TextView tvLogin = rootView.findViewById(id);
      if (tvLogin == null) {
        break missingId;
      }

      id = R.id.txt_expressao;
      ImageView txtExpressao = rootView.findViewById(id);
      if (txtExpressao == null) {
        break missingId;
      }

      id = R.id.txtPassword;
      EditText txtPassword = rootView.findViewById(id);
      if (txtPassword == null) {
        break missingId;
      }

      return new ActivityCadastroBinding((LinearLayout) rootView, btnCriarconta, dataNascTv,
          emailTv3, idDATA, idNomeTxt, idemail, loginTv, nomeTv, passwordTv, tvLogin, txtExpressao,
          txtPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
