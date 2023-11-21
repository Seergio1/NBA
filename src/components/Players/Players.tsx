import { useEffect, useState } from "react";
import "./Players.sass";
import Player from "./Player/Player";
import { alaivoGet } from "../../utils/Alaivo";
import Spinner from "../Spinner/Spinner";

interface PlayersProps {
  team: any;
}

const Players: React.FC<PlayersProps> = (props) => {
  const { team } = props;
  const { players, fetched } = useData(team.id);
  // get player from team _ (id)
  return (
    <div className="container_team_player">
      <div className="title">
        Team : <span className="team_name"> {team.nom} </span>
      </div>
      {!fetched ? (
        <div className="centered">
          <Spinner On={true} size="4rem" borderWidth="50px" />
        </div>
      ) : (
        <div className="list_player">
          {players.map((player, index) => (
            <Player key={index} player={player} />
          ))}
        </div>
      )}
    </div>
  );
};

const useData = (id_team: Number) => {
  const [players, setPlayers] = useState([]);
  const [fetched, setFetched] = useState(false);

  useEffect(() => {
    alaivoGet("equipe/" + id_team, { headers: { "Content-Type": "application/json" } }).then((res: any) => {
      console.log(res.joueurs);
      setPlayers(res.joueurs);
      setFetched(true);
    });
  }, []);
  return { players, fetched };
};

export default Players;
