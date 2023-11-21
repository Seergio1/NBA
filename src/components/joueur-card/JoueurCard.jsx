import React from "react";
import "./JoueurCard.scss";

export const props = {
  stat: {
    joueur: {
      photo: "",
      nom: "",
      prenom: "",
    },
    nombreMatch: "",
    pointParMatch: "",
    rebondParMatch: "",
    passeDecisiveParMatch: "",
  },
};

/**
 *
 * @param {props} param0
 * @returns
 */
export default function JoueurCard({ stat }) {
  const {
    joueur,
    nombreMatch,
    pointParMatch,
    rebondParMatch,
    passeDecisiveParMatch,
  } = stat;

  return (
    <div className="joueur-card">
      <div className="card-header">
        <img
          src={joueur.photo}
          alt={joueur.nom + " " + joueur.prenom}
          className="joueur-photo"
        />
      </div>
      <div className="card-body">
        <div className="joueur-nom">
          {joueur.nom} {joueur.prenom}
        </div>
        <div className="stat-container">
          <div className="stat">
            <div className="stat-value">{nombreMatch}</div>
            <div className="stat-name">M</div>
          </div>
          <div className="stat">
            <div className="stat-value">{pointParMatch}</div>
            <div className="stat-name">PPM</div>
          </div>
          <div className="stat">
            <div className="stat-value">{rebondParMatch}</div>
            <div className="stat-name">RPM</div>
          </div>
          <div className="stat">
            <div className="stat-value">{passeDecisiveParMatch}</div>
            <div className="stat-name">PDPM</div>
          </div>
        </div>
      </div>
    </div>
  );
}
