import React, { useState } from "react";
import "./Player.sass";
import steph from "../../../assets/img/StephenCurry.avif";
import ArrowBigDownIcon from "../../../assets/svg/ArrowBigDownIcon";
import AvatarIcon from "../../../assets/svg/AvatarIcon";
import { URL } from "../../../utils/Alaivo";

interface PlayerProps {
  player: any;
}
const Player: React.FC<PlayerProps> = (props) => {
  const [showDetails, setShowDetails] = useState(false);
  const { player } = props;
  const handleShowDetails = () => {
    setShowDetails(!showDetails);
  };
  return (
    <div className="player_">
      <div className="player_pic">
        {""}
        {/* <AvatarIcon /> */}
        <img src={URL + "img/" + player.pathPhoto} alt=" player picture" />
      </div>
      <div className="name">{player.nom + " " + player.prenom}</div>
      <div className={`stat ${showDetails ? "show" : ""}`}>
        {/* //// */}
        <div className="row">
          <div className="block_details">
            <div className="label"> M </div>
            <div className="value"> {player.nombreMatch} </div>
          </div>
          <div className="block_details">
            <div className="label"> RPM </div>
            <div className="value"> {player.rebondParMatch} </div>
          </div>
          <div className="block_details">
            <div className="label"> PDPM </div>
            <div className="value"> {player.passeDecisiveParMatch} </div>
          </div>
        </div>
        {/* /// */}

        <div className="row">
          <div className="block_details">
            <div className="label"> PPM </div>
            <div className="value"> {player.pointParMatch} </div>
          </div>
        </div>
        {/* /// */}
      </div>
      <div className={`hidden ${showDetails ? "reverse" : ""}`} onClick={handleShowDetails}>
        <ArrowBigDownIcon />
      </div>
    </div>
  );
};

export default Player;
