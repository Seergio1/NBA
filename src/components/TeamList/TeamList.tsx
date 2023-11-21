import React, { useEffect, useState } from "react";
import TeamBlock from "./TeamBlock/TeamBlock";
import "./TeamList.sass";
import { alaivoGet } from "../../utils/Alaivo";
import Spinner from "../Spinner/Spinner";

const TeamList = () => {
  const { teams, fetched } = useData();

  return (
    <div className="container_teams">
      <div className="list_">
        {!fetched ? (
          <div className="centered">
            <Spinner On={true} size="4rem" borderWidth="50px" />
          </div>
        ) : (
          teams.map((team, index) => <TeamBlock key={index} team={team} />)
        )}
      </div>
    </div>
  );
};

const useData = () => {
  const [teams, setTeams] = useState([]);
  const [fetched, setFetched] = useState(false);
  useEffect(() => {
    alaivoGet("equipe/allEquipe", { headers: { "Content-Type": "application/json" } }).then((res: any) => {
      console.log(res);
      setFetched(true);
      setTeams(res);
    });
  }, []);
  return { teams, fetched };
};

export default TeamList;
