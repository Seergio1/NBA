import React from "react";
import "./JoueurList.scss";
import JoueurCard from "../joueur-card/JoueurCard";
import TextWrapper from "../text-wrapper/TextWrapper";

export const props = {
  stats: [
    {
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
  ],
};

/**
 *
 * @param {props} param0
 * @returns
 */
export default function JoueurList({ stats }) {
  return (
    <div className="joueur-list">
      <div className="title">
        <TextWrapper text="Classement individuel des meilleurs joueurs" />
      </div>
      {stats.map((stat) => (
        <JoueurCard stat={stat} key={stat.classement} />
      ))}
    </div>
  );
}
