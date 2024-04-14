import { Challenge } from "../../domain/problem";
import { ChallengeItem } from "../components/challenge/item";
import { useLoaderData } from 'react-router-dom';

export const ChallengesList = () => {
    const challenges = useLoaderData() as Challenge[];
    return (
        <div>
            {challenges?.map(challenge => 
                <ChallengeItem key={challenge.id} challenge={challenge} />
            )}
        </div>
    )
}