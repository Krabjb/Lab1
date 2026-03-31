package ru.omgtu.lab1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstBFragment extends Fragment {

    public FirstBFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // 1. Инфлейтим (создаем) View из XML
        View view = inflater.inflate(R.layout.fragment_first_b, container, false);

        // 2. Находим компоненты вручную
        EditText input = view.findViewById(R.id.edit_input);
        TextView output = view.findViewById(R.id.text_output);
        Button button = view.findViewById(R.id.btn_submit);

        // 3. Ставим обработчик на кнопку
        button.setOnClickListener(v -> {
            String text = input.getText().toString();
            output.setText(text);
            Toast.makeText(getContext(), "Текст изменен!", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
