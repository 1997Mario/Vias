package com.example.mariomarcillo.vias;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdaptador  extends RecyclerView.Adapter<ListaAdaptador.ViewHolder>{
    private ArrayList<Vias> dataset;
    private Context context;

    public ListaAdaptador(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Vias p = dataset.get(position);


        holder.codigo.setText(p.getCodigo());
        holder.identificador.setText(p.getIdentificador());
        holder.longitudafirmado.setText(p.getLongitudafirmado());
        holder.longitudpavimento.setText(p.getLongitudpavimento());
        holder.muncipio.setText(p.getMuncipio());
        holder.nombrevia.setText(p.getNombrevia());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarLista(ArrayList<Vias> lista) {
        dataset.addAll(lista);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        private TextView codigo;
        private TextView identificador;
        private TextView longitudafirmado;
        private TextView longitudpavimento;
        private TextView muncipio;
        private TextView nombrevia;


        public ViewHolder(View itemView)
        {
            super(itemView);
            codigo = (TextView) itemView.findViewById(R.id.altitud1);
            identificador= (TextView) itemView.findViewById(R.id.fecha1);
            longitudafirmado= (TextView) itemView.findViewById(R.id.id1);
            longitudpavimento= (TextView) itemView.findViewById(R.id.latitud1);
            muncipio= (TextView) itemView.findViewById(R.id.longitu1);
            nombrevia= (TextView) itemView.findViewById(R.id.nombre1);
        }
    }
}
