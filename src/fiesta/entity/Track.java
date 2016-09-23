/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiesta.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author gilbert
 */
@Entity
public class Track implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
    
    @OneToMany(mappedBy = "track")
    private List<RankedTrack> ranks = new ArrayList<>();
    
    @OneToMany(mappedBy = "track")
    private List<Purchase> purchases = new ArrayList<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Track() {
    }

    public Track(Album album) {
        this.album = album;
    }

    public List<RankedTrack> getRanks() {
        return ranks;
    }

    public void addRank(RankedTrack rank) {
        this.ranks.add(rank);
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }
    
    public void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Track)) {
            return false;
        }
        Track other = (Track) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fiesta.entity.music.Track[ id=" + id + " ]";
    }
    
}
