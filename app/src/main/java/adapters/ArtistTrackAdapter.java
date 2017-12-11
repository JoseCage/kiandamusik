package adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import models.ArtistTrackList;

/**
 * Created by josecage on 11-12-2017.
 */

public class ArtistTrackAdapter extends RecyclerView.Adapter<ArtistTrackAdapter.ViewHolder> {

    public ArtistTrackAdapter(Context context, ArtistTrackList trakList) {
        this.context = context;
        this.trackList = trackList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mTrackCover;
        public TextView mArtistName;
        public TextView mTrackName;
        public ImageView mArtistVerified;
        public ImageView mTrackDetails;

        public ViewHolder(View itemView) {
            // Criamos os itens do nosso list_item layout
            super(itemView);
            mTrackCover = itemView.findViewById(R.id.trackCover);
            mTrackDetails = itemView.findViewById(R.id.trackDetails);
            mTrackName = itemView.findViewById(R.id.trackName);
            mArtistVerifiedBadge = itemView.findViewById(R.id.verifiedAccount);
            mArtisName = itemView.findViewById(R.id.artistName);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.list_item, parent);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mArtistName.setText(trackList.getArtistTracks().get(position).getArtist().getName());
        holder.mTrackName.setText(trackList.getArtistTracks().get(position).getaName());
        holder.mTrackCover.setImageResource(trackList.getArtistTracks().get(position).getTrackCover());
        if(trackList.getArtistTracks().get(position).getArtist().isVerified()) {
            holder.mArtistVerifiedBadge.setImageResource(R.drawable.ic_verified)
        } else {
            // Não apresentamos o badge pois o artista não foi verificado.
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
