import React, { useEffect, useRef, useState } from "react";
import "./TeamBlock.sass";
import {
  IonButton,
  IonButtons,
  IonContent,
  IonHeader,
  IonInput,
  IonItem,
  IonModal,
  IonTitle,
  IonToolbar,
} from "@ionic/react";
import Lakers from "../../../assets/img/lakers.png";
import Players from "../../Players/Players";
import ArrowRight from "../../../assets/svg/ArrowRight";
import { URL } from "../../../utils/Alaivo";

interface TeamProps {
  team: any;
}

const TeamBlock = (props: TeamProps) => {
  const [isOpen, setOpen] = useState(false);
  const { team } = props;
  const handleOpen = () => {
    setOpen(!isOpen);
  };
  useEffect(() => {}, [isOpen]);
  return (
    <>
      <div className="block_team">
        <div className="right">
          <div className="pic_team">
            <img src={URL + "img/" + team.pathPhoto} alt="logo team" />
          </div>
        </div>
        <div className="left">
          <div className="name_team"> {team.nom} </div>
          <div className="sub_name_team"> {team.abreviation} </div>
          <div className="see_details" onClick={handleOpen}>
            <ArrowRight />
          </div>
        </div>
      </div>

      {/* //// */}
      <IonModal isOpen={isOpen}>
        <IonHeader>
          <IonToolbar>
            <IonTitle> Players </IonTitle>
            <IonButtons slot="start">
              <IonButton strong={true} onClick={() => handleOpen()}>
                Back
              </IonButton>
            </IonButtons>
          </IonToolbar>
        </IonHeader>
        <IonContent>
          <Players team={team} />
        </IonContent>
      </IonModal>
    </>
  );
};

export default TeamBlock;
