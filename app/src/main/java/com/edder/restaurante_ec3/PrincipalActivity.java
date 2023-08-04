package com.edder.restaurante_ec3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.edder.restaurante_ec3.databinding.ActivityPrincipalBinding;
import com.edder.restaurante_ec3.fragments.HomeFragment;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {
    private ActivityPrincipalBinding binding;
    public static String EMAIL = "EMAIL";
    private String email;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.fabAddMovie.setOnClickListener(v -> {
//            Snackbar.make(binding.getRoot(),"Add a Movie", Snackbar.LENGTH_SHORT).show();
//        });
        setSession();
        addHomeFragment();


    }

    private void addHomeFragment() {
        getSupportFragmentManager().beginTransaction().add(binding.fcvMain.getId(),new HomeFragment()).commit();
    }

    private void setSession() {
        setSupportActionBar(binding.tbPlayzoom);
        Intent getIntent = getIntent();
        email = getIntent.getStringExtra(EMAIL);
        binding.txtEmail.setText(email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.restaurante_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.search){
            Snackbar.make(binding.getRoot(),"Search", Snackbar.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.settings){
            Snackbar.make(binding.getRoot(),"Settings", Snackbar.LENGTH_SHORT).show();
            return true;
        }else {
            return false;
        }
    }

}
