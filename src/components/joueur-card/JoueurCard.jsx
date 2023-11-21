import React from "react";
import "./JoueurCard.scss";

export const props = {
  stat: {
    classement: "",
    joueur: {
      photo: "",
      nom: "",
      prenom: "",
    },
    equipe: "",
    match: "",
    matchJoues: "",
    pointParMatch: "",
    rebondParMatch: "",
    passeDecisiveParMatch: "",
    minuteParMatch: "",
    troisPointMoyenne: "",
    lancerFrancMoyenne: "",
  },
};

/**
 *
 * @param {props} param0
 * @returns
 */
export default function JoueurCard({ stat }) {
  const {
    classement,
    joueur,
    equipe,
    match,
    matchJoues,
    pointParMatch,
    rebondParMatch,
    passeDecisiveParMatch,
    minuteParMatch,
    troisPointMoyenne,
    lancerFrancMoyenne,
  } = stat;

  return (
    <div className="joueur-card">
      <div className="card-header">
        {classement}
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
        <div className="joueur-equipe">{equipe}</div>
        <div className="stat-container">
          <div className="stat">
            <div className="stat-value">{match}</div>
            <div className="stat-name">M</div>
          </div>
          <div className="stat">
            <div className="stat-value">{matchJoues}</div>
            <div className="stat-name">MJ</div>
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
          <div className="stat">
            <div className="stat-value">{minuteParMatch}</div>
            <div className="stat-name">MPM</div>
          </div>
          <div className="stat">
            <div className="stat-value">{troisPointMoyenne}</div>
            <div className="stat-name">3P%</div>
          </div>
          <div className="stat">
            <div className="stat-value">{lancerFrancMoyenne}</div>
            <div className="stat-name">LF%</div>
          </div>
        </div>
      </div>
    </div>
  );
}
