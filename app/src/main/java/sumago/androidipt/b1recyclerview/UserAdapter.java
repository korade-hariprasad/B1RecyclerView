package sumago.androidipt.b1recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    ArrayList<User> list;

    public UserAdapter(ArrayList<User> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_with_image,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {

        holder.tvName.setText(list.get(position).getName());
        holder.tvAge.setText(""+list.get(position).getAge());
        holder.tvRollNo.setText(""+list.get(position).getRollNo());
        holder.imageView.setImageResource(list.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvAge;
        TextView tvRollNo;

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvRollNo=itemView.findViewById(R.id.tvRollNo);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
