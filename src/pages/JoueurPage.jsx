import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import JoueurList from "../components/joueur-list/JoueurList";

export default function JoueurPage() {
  const [stats, setStats] = useState([]);

  const fetchDatas = () => {
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
