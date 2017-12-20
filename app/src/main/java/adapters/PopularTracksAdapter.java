package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.mentedigital.kiandamusik.R;
import models.PopularTrackList;

/**
 * Created by josecage on 18-12-2017.
 */

public class PopularTracksAdapter extends RecyclerView.Adapter<PopularTracksAdapter.ViewHolder> {

    private Context mContext;
    private PopularTrackList mPopularTrackList;

    public PopularTracksAdapter(Context context, PopularTrackList popularTrackList) {
        this.mContext = mContext;
        this.mPopularTrackList = mPopularTrackList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView popularTrackCover;
        public ImageView verifiedArtistBadge;
        public TextView popularArtistName;
        public TextView popularTrackTitle;
        public ImageView mPopularTrackDetails;

        public ViewHolder(View itemView) {
            // Criamos os itens do nosso activity principal layout
            super(itemView);
            popularTrackCover = itemView.findViewById(R.id.trackCover);
            verifiedArtistBadge = itemView.findViewById(R.id.verifiedAccount);
            popularArtistName = itemView.findViewById(R.id.artistName);
            popularTrackTitle = itemView.findViewById(R.id.trackName);
            mPopularTrackDetails = itemView.findViewById(R.id.trackDetails);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.popularTrackTitle.setText(mPopularTrackList.getPopularTracks().get(position).getaName());
        holder.popularArtistName.setText(mPopularTrackList.getPopularTracks().get(position).getArtist().getName());
        holder.popularTrackCover.setImageResource(mPopularTrackList.getPopularTracks().get(position).getTrackCover());
        if (mPopularTrackList.getPopularTracks().get(position).getArtist().isVerified()) {
            holder.verifiedArtistBadge.setImageResource(R.drawable.ic_verified_user_black_18dp);
        } else {
            // Artista não verificado. Logo, não apresenta o badge.
        }
    }

    @Override
    public int getItemCount() {
        return mPopularTrackList.getPopularTracks().size();
    }
}
