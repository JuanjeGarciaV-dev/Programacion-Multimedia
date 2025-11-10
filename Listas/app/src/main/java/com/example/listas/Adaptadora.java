package com.example.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptadora extends RecyclerView.Adapter<Adaptadora.FutbolViewHolder> {

    private List<Equipos_Futbol> listaEquipos;
    private Context context;

    public Adaptadora(Context context, List<Equipos_Futbol> listaEquipos) {
        this.context = context;
        this.listaEquipos = listaEquipos;
    }

    @NonNull
    @Override
    public FutbolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.futbol_item, parent, false);
        return new FutbolViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull FutbolViewHolder holder, int position) {
        Equipos_Futbol equipo = listaEquipos.get(position);
        holder.bindEquipo(equipo);
    }

    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

    public void addItem(Equipos_Futbol equipo) {
        listaEquipos.add(equipo);
        notifyItemInserted(listaEquipos.size() - 1);
    }

    public class FutbolViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        TextView txtEstadio;
        TextView txtAficionados;
        ImageView imgEquipo;

        public FutbolViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtEstadio = itemView.findViewById(R.id.txtEstadio);
            txtAficionados = itemView.findViewById(R.id.txtAficionados);
            imgEquipo = itemView.findViewById(R.id.imgEquipo);
        }

        public void bindEquipo(Equipos_Futbol equipo) {
            txtTitle.setText(equipo.getTitle());
            txtEstadio.setText(equipo.getEstadio());
            txtAficionados.setText(equipo.getNombre_aficionados());
            int idImagen = itemView.getContext().getResources().getIdentifier(
                    equipo.getImage(),
                    "drawable",
                    itemView.getContext().getPackageName()
            );
            imgEquipo.setImageResource(idImagen);
        }
    }
}
