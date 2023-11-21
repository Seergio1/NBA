import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import JoueurList from "../components/joueur-list/JoueurList";

export default function JoueurPage() {
  const [stats, setStats] = useState([]);

  const fetchDatas = () => {
    fetch("https://nba-production.up.railway.app/joueur/allJoueur")
      .then((response) => response.json())
      .then((response) => {
        setStats(
          response.map((item) => ({
            joueur: {
              photo:
                "https://nba-production.up.railway.app/img/" + item.pathPhoto,
              nom: item.nom,
              prenom: item.prenom,
            },
            nombreMatch: item.nombreMatch,
            pointParMatch: item.pointParMatch,
            rebondParMatch: item.rebondParMatch,
            passeDecisiveParMatch: item.passeDecisiveParMatch,
          }))
        );
      });
    setStats([]);
  };

  useEffect(() => {
    fetchDatas();
  }, []);

  return (
    <div className="joueur-page">
      <JoueurList stats={stats} />
    </div>
  );
}
